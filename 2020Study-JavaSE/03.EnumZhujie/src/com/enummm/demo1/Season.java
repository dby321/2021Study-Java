package com.enummm.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.enummm.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 20:13
 * @Description:
 */
public class Season {
    private final String seasonName;
    private final String seasonDesc;
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    public static final Season SPRING=new Season ( "春天","春暖花开" );
    public static final Season SUMMER=new Season ( "夏天","热热热" );
    public static final Season WINTER=new Season ( "冬天","冷冷冷" );

    public String getSeasonName() {
        return this.seasonName;
    }

    public String getSeasonDesc() {
        return this.seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
