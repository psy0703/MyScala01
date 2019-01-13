package Exercises.d06
import java.awt.geom.Ellipse2D

/**
  * 特质
  * 1、java.awt.Rectangle类有两个很有用的方法translate和grow,
  * 但可惜的是像java.awt.geom.Ellipse2D这样的类没有。
  * 在Scala中，你可以解决掉这个问题。
  * 定义一个RectangleLike特质,加入具体的translate和grow方法。
  * 提供任何你需要用来实现的抽象方法,以便你可以像如下代码这样混入该特质:
  * val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
  * egg.translate(10,-10)
  * egg.grow(10,20)
  *
  * @author cloud9831 
  *         @2019-01-13 13:36 
  */
object Exer01 {
  def main(args: Array[String]): Unit = {
    val egg = new Ellipse2D.Double(5,10,20,30)
    println(egg.height +"-" +egg.width +"-"+ egg.x +"-"+ egg.y)

  }
}
trait RecTangleLike {
  def translate(dx:Int,dy:Int): Unit ={

  }
  def grow(h:Int,v:Int): Unit ={

  }
}
/*
public void grow(int h, int v) {
        long x0 = this.x;
        long y0 = this.y;
        long x1 = this.width;
        long y1 = this.height;
        x1 += x0;
        y1 += y0;

        x0 -= h;
        y0 -= v;
        x1 += h;
        y1 += v;

        if (x1 < x0) {
            // Non-existant in X direction
            // Final width must remain negative so subtract x0 before
            // it is clipped so that we avoid the risk that the clipping
            // of x0 will reverse the ordering of x0 and x1.
            x1 -= x0;
            if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE;
            if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE;
            else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE;
        } else { // (x1 >= x0)
            // Clip x0 before we subtract it from x1 in case the clipping
            // affects the representable area of the rectangle.
            if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE;
            else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE;
            x1 -= x0;
            // The only way x1 can be negative now is if we clipped
            // x0 against MIN and x1 is less than MIN - in which case
            // we want to leave the width negative since the result
            // did not intersect the representable area.
            if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE;
            else if (x1 > Integer.MAX_VALUE) x1 = Integer.MAX_VALUE;
        }

        if (y1 < y0) {
            // Non-existant in Y direction
            y1 -= y0;
            if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE;
            if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE;
            else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE;
        } else { // (y1 >= y0)
            if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE;
            else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE;
            y1 -= y0;
            if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE;
            else if (y1 > Integer.MAX_VALUE) y1 = Integer.MAX_VALUE;
        }

        reshape((int) x0, (int) y0, (int) x1, (int) y1);
    }
 */
/*
 /**
     * Translates this <code>Rectangle</code> the indicated distance,
     * to the right along the X coordinate axis, and
     * downward along the Y coordinate axis.
     * @param dx the distance to move this <code>Rectangle</code>
     *                 along the X axis
     * @param dy the distance to move this <code>Rectangle</code>
     *                 along the Y axis
     * @see       java.awt.Rectangle#setLocation(int, int)
     * @see       java.awt.Rectangle#setLocation(java.awt.Point)
     */
    public void translate(int dx, int dy) {
        int oldv = this.x;
        int newv = oldv + dx;
        if (dx < 0) {
            // moving leftward
            if (newv > oldv) {
                // negative overflow
                // Only adjust width if it was valid (>= 0).
                if (width >= 0) {
                    // The right edge is now conceptually at
                    // newv+width, but we may move newv to prevent
                    // overflow.  But we want the right edge to
                    // remain at its new location in spite of the
                    // clipping.  Think of the following adjustment
                    // conceptually the same as:
                    // width += newv; newv = MIN_VALUE; width -= newv;
                    width += newv - Integer.MIN_VALUE;
                    // width may go negative if the right edge went past
                    // MIN_VALUE, but it cannot overflow since it cannot
                    // have moved more than MIN_VALUE and any non-negative
                    // number + MIN_VALUE does not overflow.
                }
                newv = Integer.MIN_VALUE;
            }
        } else {
            // moving rightward (or staying still)
            if (newv < oldv) {
                // positive overflow
                if (width >= 0) {
                    // Conceptually the same as:
                    // width += newv; newv = MAX_VALUE; width -= newv;
                    width += newv - Integer.MAX_VALUE;
                    // With large widths and large displacements
                    // we may overflow so we need to check it.
                    if (width < 0) width = Integer.MAX_VALUE;
                }
                newv = Integer.MAX_VALUE;
            }
        }
        this.x = newv;

        oldv = this.y;
        newv = oldv + dy;
        if (dy < 0) {
            // moving upward
            if (newv > oldv) {
                // negative overflow
                if (height >= 0) {
                    height += newv - Integer.MIN_VALUE;
                    // See above comment about no overflow in this case
                }
                newv = Integer.MIN_VALUE;
            }
        } else {
            // moving downward (or staying still)
            if (newv < oldv) {
                // positive overflow
                if (height >= 0) {
                    height += newv - Integer.MAX_VALUE;
                    if (height < 0) height = Integer.MAX_VALUE;
                }
                newv = Integer.MAX_VALUE;
            }
        }
        this.y = newv;
    }
 */
