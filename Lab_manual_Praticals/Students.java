public class Students {
    private int enrollmentNo;
    private String name;

    public void setdata(int e, String n){
        enrollmentNo = e;
        name = n;
        System.out.println("Name of Student:" + name);
        System.out.println("enrollmentNo of Student:" +enrollmentNo);
      
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        s1.setdata(7150, "dhruvil");
        s2.setdata(7159, "jay");
        s3.setdata(7160, "mahesh");
    }
}
