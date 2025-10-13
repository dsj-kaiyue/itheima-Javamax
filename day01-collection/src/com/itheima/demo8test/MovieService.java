package com.itheima.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieService {
    //4.准备一个集合容器：存储全部上架的数据
    private static List<Movie> movies=new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);
    public void start() {
        //3. 准备操作界面
        while(true){
            System.out.println("====电影信息操作系统====");
            System.out.println("1. 添加电影");
            System.out.println("2. 查询电影");
            System.out.println("3. 下架电影");
            System.out.println("4. 封杀某明星");
            System.out.println("5. 退出");
            System.out.println("请你输入操作命令：");
            String command=sc.next();
            switch(command){
                case "1":
                    addMovie();
                    break;
                case "2":
                    queryMovie();
                    break;
                case "3":

                    break;
                case "4":
                    deleteStar();
                    break;
                case "5":
                    System.out.println("欢迎下次再来");
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }

    }

    /**
     * 封杀某明星
     */
    private void deleteStar() {
        System.out.println("====封杀某明星====");
        System.out.println("请输入要封杀的明星：");
        String star=sc.next();
        for (int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if(movie.getActor().contains(star)){
                movies.remove(movie);
                System.out.println("封杀成功");
                i--;
            }
        }

    }

    /**
     * 查询电影
     */
    private void queryMovie() {
        System.out.println("====查询电影====");
        System.out.println("请输入电影名称：");
        String name=sc.next();
        Movie movie=queryMovieByName(name);
        if (movie !=null){
            System.out.println("查询成功");
            System.out.println(movie);
        }else{
            System.out.println("没有此电影");
        }

    }


    //根据电影名称查询电影
    public Movie queryMovieByName(String name){
        for (Movie movie : movies) {
            if(movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }

    /**
     * 上架电影
     */
    private void addMovie() {
        System.out.println("======上架电影======");
        Movie movie=new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());
        System.out.println("请输入主演：");
        movie.setActor(sc.next());
        System.out.println("请输入价格：");
        movie.setPrice(sc.nextDouble());

        movies.add(movie);


    }
}
