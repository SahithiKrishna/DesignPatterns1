package com.example.demo.Builder;

public class TestBuilderExample {
    public static void main(String[] args){
        BuilderExample comp = new BuilderExample.BuilderkaBuilder("64GB","1TB").setGraphicConfig("10UG").build();
        System.out.println("With parameter: "+comp);
        BuilderExample comp2 = new BuilderExample.BuilderkaBuilder("128GB","512GB").build();
        System.out.println("Without parameter: "+comp2);
    }
}
