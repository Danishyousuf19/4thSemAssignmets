package com.danish.collectons;


public class stu {
    int a;
    String b;

    stu(int x, String n) {
        a = x;
        b = n;
    }

   
    @Override
    public String toString() {
    	return "Object {"   +this.a+" , "+this.b+" }";
    }

	public int hashCode() {
		return this.a + this.b.hashCode();
	}
    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass())
            return false;
        stu c = (stu) o;
        return this.a == c.a && this.b.equals(c.b);
    }
}
