package com.itheima.demo4test;

import java.util.*;

public class Room {


    //1.准备好54张牌
    private List<Card> allCards =new ArrayList<>();

    //2.初始化54张牌
    {
        //准备点数
        String[] sizes={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //准备花色
        String[] colors={"♠","♥","♣","♦"};


        //创建54张牌
        int num=0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                allCards.add(new Card(size,color,num));
            }
        }

        Collections.addAll(allCards,new Card("","小王",++num),new Card("","大王",++num));
        System.out.println("新牌是"+allCards);
    }

    public void start() {
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);

        //发牌  令狐冲 令狐白 令狐紫
        Map<String,List<Card>> players= new HashMap<>();
        List<Card> lhc=new ArrayList<>();
        players.put("令狐冲",lhc);
        List<Card> lhb=new ArrayList<>();
        players.put("令狐白",lhb);
        List<Card> lhz=new ArrayList<>();
        players.put("令狐紫",lhz);
        for (int i = 0; i < allCards.size()-3; i++) {
            Card card=allCards.get(i);
            if (i%3==0){
                lhc.add(card);
            }else if (i%3==1){
                lhb.add(card);
            }else {
                lhz.add(card);
            }

        }

        //那最后三种底牌  （计算机包前不包后）
        List<Card> lastCards=allCards.subList(allCards.size()-3,allCards.size());
        System.out.println("底牌是"+lastCards);

        //抢地主
        lhz.addAll(lastCards);

        //对牌排序
        sortCards(lhc);
        sortCards(lhb);
        sortCards(lhz);

        //看牌,遍历map集合
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            //读取玩家名称
            String name=entry.getKey();
            //读取玩家牌
            List<Card> cards=entry.getValue();
            //遍历
            System.out.println(name+"的牌是"+cards);
        }

    }

    //排序
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o2.getNum()- o1.getNum());
    }


}
