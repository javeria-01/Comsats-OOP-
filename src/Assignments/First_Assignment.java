package Assignments;
    class Rectangle {
        double width;
        double height;
        Rectangle(){
            this.width = 1;
            this.height = 1;
        }
        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        double getarea(){
           double area =  width*height;
           return area;
        }

        double getparameter() {
            double parameter = (2 * (width + height));
            return parameter;
        }
        public static void main(String[] args) {
             Rectangle obj1 = new Rectangle(4 , 40);
             Rectangle obj2 = new Rectangle(3.5 , 35.5);
             System.out.println("Rectangle 1 properties");
                System.out.println("width is " +obj1.width);
                System.out.println("Height is " +obj1.height);
                System.out.println("Area is "+obj1.getarea());
                System.out.println("Perimeter is "+obj1.getparameter());
             System.out.println("Rectangle 2 properties");
                System.out.println("Width is "+obj2.width);
                System.out.println("Height is "+obj2.height);
                System.out.println("Area is "+obj2.getarea());
                System.out.println("Perimeter is "+obj2.getparameter());
            }
        }
