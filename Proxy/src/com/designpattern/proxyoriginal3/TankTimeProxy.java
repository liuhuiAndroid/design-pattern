package com.designpattern.proxyoriginal3;
public class TankTimeProxy implements Moveable{
Moveable t;
public TankTimeProxy(Moveable t) {
super();
this.t = t;
}
@Override
public void move() {
long start = System.currentTimeMillis();
t.move();
long end = System.currentTimeMillis();
System.out.println("time:"+(end - start));
}
}