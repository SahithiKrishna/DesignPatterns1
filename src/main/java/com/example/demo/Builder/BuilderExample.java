package com.example.demo.Builder;

//This design pattern helps in avoiding passing multiple arguments in the factory class and also avoids creating various constructors for all the required  combinations
//In the factory pattern you had to pass all the arguments mandatorily
//Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object
public class BuilderExample {
    private String ram;
    private String memory;

    //Optional parameters
    private String graphicConfig;
    public String getRam(){
        return this.ram;
    }
    public String getMemory(){
        return this.memory;
    }
    public String getGraphicConfig(){
        return this.graphicConfig;
    }

    private BuilderExample(BuilderkaBuilder builderkaBuilder){
        this.ram = builderkaBuilder.ram;
        this.graphicConfig = builderkaBuilder.graphicConfig;;
        this.memory = builderkaBuilder.memory;
    }

    public String toString(){
        return "Computer built with: "+"graphicConfig "+getGraphicConfig()+" ram:"+getRam()+" Memory:"+getMemory();
    }
    public static class BuilderkaBuilder{
        private String ram;
        private String memory;
        private String graphicConfig;

        public BuilderkaBuilder(String ram, String memory){
            this.ram = ram;
            this.memory = memory;
        }
        public BuilderkaBuilder setGraphicConfig(String graphicConfig){
            this.graphicConfig = graphicConfig;
            return this;
        }
        public BuilderExample build(){
            return new BuilderExample(this);
        }

    }

}
