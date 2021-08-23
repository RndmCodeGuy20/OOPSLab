public class Assg5 {
    public static void main(String[] args) {
        Figure f;
        f = new Open();
        f.display();

        f = new Close();
        f.display();

        f = new Line(0);
        f.display();

        f = new Polyline(0);
        f.display();

        f = new Polygon("n");
        f.display();

        f = new Eclipse("\u221E");
        f.display();
    }

}

abstract class Figure {
    abstract void display();
}

class Open extends Figure {
    Open() {
        System.out.println("\nThis is an Open Figure...");
    }

    void display() {
        System.out.println("An Open figure can be defined as a figure whose line segments and/or curves do not meet.");
    }
}

class Line extends Open {
    void display() {
        System.out.println("This is a line! ");
    }

    Line(int numedge) {
        System.out.println("No. of edges of a line: " + numedge);
    }
}

class Polyline extends Open {
    void display() {
        System.out.println("This is a Polyline! ");
    }

    Polyline(int numedge) {
        System.out.println("No. of edges of a Polyline: " + numedge);
    }
}

class Close extends Figure {
    Close() {
        System.out.println("\nThis is a Closed Figure...");
    }

    void display() {
        System.out.println("A Closed figure can be defined as a enclosed figure whose line segments and/or curves" + " are connected or meet. ");
    }
}

class Polygon extends Close {
    void display() {
        System.out.println("This is a Polygon! ");
    }

    Polygon(String numedge) {
        System.out.println("No. of edges of a 'n' sided Polygon: " + numedge);
    }
}

class Eclipse extends Close {
    void display() {
        System.out.println("This is an Eclipse! ");
    }

    Eclipse(String numedge) {
        System.out.println("No. of edges of an Eclipse: " + numedge);
    }
}
