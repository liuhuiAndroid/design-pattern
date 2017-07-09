package com.designpattern.proxyoriginal4;
public class TankTimeProxy implements com.designpattern.proxyoriginal4.Moveable{
Moveable t;
public TankTimeProxy(Moveable t) {
super();
this.t = t;
}
@Override
public void move(){
long start = System.currentTimeMillis();
t.move();
long end = System.currentTimeMillis();
System.out.println("time:"+(end - start));
}
}