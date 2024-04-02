package com.example.demo.Adapter;

public class SocketObjectAdapterImpl extends Socket implements SocketAdapter{

    private Socket socket = new Socket();
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt(),10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt(),40);
    }

    private Volt  convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
