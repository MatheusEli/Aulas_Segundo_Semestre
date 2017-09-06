public static void main(String[] args) {
        // TODO code application logic here
    
        StringBuilder strb = new StringBuilder ();
        System.out.println(strb.length());
        System.out.println(strb.capacity());
        strb.ensureCapacity(10);
        System.out.println(strb.capacity());
        StringBuilder strb1 = new StringBuilder("Object");
        System.out.println(strb1.length());
        System.out.println(strb1.capacity());
        strb1.ensureCapacity(25);
        System.out.println(strb1.capacity());

        strb1.setCharAt(5, 'X');
    
        System.out.println(strb1);
   
    }
