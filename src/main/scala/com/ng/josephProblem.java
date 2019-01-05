package com.ng;

import java.util.LinkedList;
import java.util.List;

/**
 * 约瑟夫问题：
 * n个人按顺序围成一圈(编号为1~n),从第1个人从1开始报数，
 * 报到k的人出列，相邻的下个人重新从1开始报数，报到k的人出列，
 * 重复这个过程，直到队伍中只有1个人为止，这就是约瑟夫问题。
 * 现在给定n和k，你需要返回最后剩下的那个人的编号。
 */
public class josephProblem {

    /**
     * @param n: an integer
     * @param k: an integer
     * @return: the last person's number
     */
    public int josephProblem(int n, int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int i = 0;
        while (list.size() != 1) {
            i = (i + k - 1) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
