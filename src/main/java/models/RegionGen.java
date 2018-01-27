package models;

import java.util.Arrays;
import java.util.List;

public class RegionGen extends Generator{

    int id;
    int areasNum;
    List<String> tags;

//    RegionGen(){
//        areasNum = 0;
//    }

    public static class Builder {
        int id;
        int areasNum;
        List<String> tags;

        //builder methods
        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setAreasNum(int num){
            this.areasNum = num;
            return this;
        }

        public Builder setTags(String... tags){
            this.tags = Arrays.asList(tags);
            return this;
        }

        public RegionGen builder(){
            return new RegionGen(this);
        }
    }

    private RegionGen(Builder builder){
        this.areasNum = builder.areasNum;
        this.id = builder.id;
        this.tags = builder.tags;
    }

}
