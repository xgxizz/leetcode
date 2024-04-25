package priv.xgx.数组双指针._380_o1时间插入删除获取随机元素;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;

    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int lastElem = list.get(list.size() - 1);

        list.set(index, lastElem);
        map.put(lastElem, index);
        list.remove(list.size() - 1);
        map.remove(val);

        return true;

    }

    public int getRandom() {

        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

}