package com.valtech.proj.training.day1;


public class Point3D1 extends Point
{
    private int z;
    public Point3D1() {}
    
    public Point3D1(int x, int y, int z)
    {
        super(x,y);
        this.z=z;
    }
    @Override
    public double distance ()
    {
        return Math.sqrt(x*x+y*y+z*z);
    }
    
    public double distance(int x,int y,int z)
    {
        int dx = this.x-x;
        int dy = this.y-y;
        int dz = this.z-z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
    /**
     * return -1 if the object is smaller
     * 0 if it is equal
     * 1 if it is greater
     */
    public int compareTo(Point3D1 o) {
        if(distance() < o.distance()) {
            return -1;
        }
        if(distance() == o.distance()) {
            if(x < o.x) {
            
            return -1;
        }
        if(x >o.x) return +1;
        return 0;
    
        }
        return +1;
        
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point3D) {
        Point3D1 p=(Point3D1) obj;
        return p.x == x && p.y == y;
        }
        return false;
    }
    @Override
    public int hashCode() {
        
        return ("X="+x+"Y="+y).hashCode();
    }
    @Override
    public String toString() {
        
        return new StringBuffer("X= ").append(x).append("Y = ").append(y).toString();
    }
    public double distance(Point3D1 p)
    {
        return distance(p.x,p.y,p.z);
    }



   public int getZ() {
        return z;
    }



   public void setZ(int z) {
        this.z = z;
    }
    public static void main(String[] args)
    {
        System.out.println(new Point3D1());
        Point3D1 p= new Point3D1(10,20,30);
        System.out.println(p.distance());
    }
}

