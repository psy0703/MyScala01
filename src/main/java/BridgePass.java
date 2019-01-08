import java.util.Vector;

/*
递归的出口是：“2人过桥”情况。2人过桥，不需要有人返回，所以非常简单，总时间就是单人所需时间中的最大值。
如果是“n人过桥”(n>=3)，那完全可以递归了。
假设是从桥头A至桥头B，桥头A的人群为一个集合，桥头B的人群为另一个集合。
那么首先可以从A中任意选择2个人从A到B；则A集合中减少2个人，B集合中增加2个人；
然后需要一个人从B返回A，这个可以分析出如果想要比较少的时间，一定是从B中选一个单独需时最短的；此时B中减少一个人，A集合中增加一个人；
之后情况变成了“n-1人过桥”问题。
递归思想就开始起作用了。
*/
public class BridgePass {

    private Vector v_source = null;
    private Vector v_destination = null;
    private static int time_total = 0;

    public BridgePass()
    {
        v_source = new Vector();
        v_destination = new Vector();
    }

    public void setSource(int[] array, int num){
        for(int i=0; i<num; i++){
            v_source.addElement(array[i]);
        }
    }

    public Vector getSource(){
        return v_source;
    }

    public Vector getDestination(){
        return v_destination;
    }

    /**
     * the recursive algorithm.
     * @param src : the set of persons in A-side
     * @param des : the set of persons in B-side
     * @param size : the number of persons in A-side
     * @param totalTime : the totalTime has used
     */
    public void passMethod(Vector src, Vector des, int size, int totalTime)
    {

        //If only 2 persons in A-side, just pass bridge together in one time.
        if(size == 2){
            System.out.println("A->B:"+src.elementAt(0)+" AND "+ src.elementAt(1));
            System.out.println("*****Total Time: "+(totalTime + Math.max((Integer)src.elementAt(0),(Integer)src.elementAt(1)))+"****");
        } else if(size >= 3){

            // if more than 2 persons in A-Side, use the recursive algorithm.
            for(int i=0; i<size; i++){
                for(int j=i+1; j<size; j++){
                    System.out.println("i="+i+"j="+j);
                    //Pass, A->B

                    Vector _src = new Vector();
                    Vector _des = new Vector();
                    _src = (Vector)src.clone();
                    _des = (Vector)des.clone();

                    int time1 = 0;
                    int time2 = 0;

                    time1 = (Integer)_src.elementAt(i);
                    _des.addElement(time1);

                    time2 = (Integer)_src.elementAt(j);
                    _des.addElement(time2);

                    System.out.print("A->B:"+ time1);
                    System.out.println(" AND "+ time2);

                    _src.removeElement(time1);
                    _src.removeElement(time2);

                    //BACK, B->A

                    int minValue = (Integer)_des.elementAt(0);
                    for(int k=0 ; k<_des.size(); k++){
                        if(((Integer)_des.elementAt(k)).intValue() < minValue){
                            minValue = (Integer)_des.elementAt(k);
                        }
                    }

                    _src.addElement(minValue);
                    _des.removeElement(minValue);

                    System.out.println("B->A:"+minValue);

                    passMethod(_src, _des, _src.size(), totalTime + Math.max(time1, time2) + minValue);

                }

            }
        }
    }


    public static void main(String[] cmd)
    {
        BridgePass test = new BridgePass();

        //the persons want to pass bridge:
        int source[] = {1,2,5,10};

        test.setSource(source, source.length);
        test.passMethod(test.getSource(), test.getDestination(), source.length, 0);

    }


}
