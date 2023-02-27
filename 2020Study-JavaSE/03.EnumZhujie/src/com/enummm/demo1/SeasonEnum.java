package com.enummm.demo1;

/**
 * @BelongsProject: 2020Study-JavaSE
 * @BelongsPackage: com.enummm.demo1
 * @Author: Dong Binyu
 * @CreateTime: 2020-10-23 20:20
 * @Description:
 */

interface info{
    void show();
}
public enum SeasonEnum implements info{
    /**
     *
     */
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println ("蠢蠢蠢");
        }
    },
    /**
     *
     */
    SUMMER("夏天","热热热"){
        @Override
        public void show() {
            System.out.println ("吓吓吓");
        }
    },
    /**
     *
     */
    WINTER("冬天","冷冷冷"){
        @Override
        public void show() {
            System.out.println ("咚咚咚");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
