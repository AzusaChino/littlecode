package cn.az.code.year2021.july;

import java.util.ArrayList;

/**
 * @author az
 * @since 2021-07-28
 */
public class BeautifulArray {

    public int[] beautifulArray(int N) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while (res.size() < N) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i : res)
                if (i * 2 - 1 <= N)
                    tmp.add(i * 2 - 1);
            for (int i : res)
                if (i * 2 <= N)
                    tmp.add(i * 2);
            res = tmp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

}
