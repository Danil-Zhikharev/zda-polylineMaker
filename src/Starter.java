public class Starter {
    // Задача 3.1.2

    public static void main(String[] args) {

        int[] start = new int[]{1, 5};
        int[] end = new int[]{5, 3};

        // Создание первой ломаной
        Polyline firstPolyline = new Polyline();
        firstPolyline.addPoint(new Point(start));
        firstPolyline.addPoint(new Point(2, 8));
        firstPolyline.addPoint(new Point(end));
        System.out.println(firstPolyline);

        // Создание второй ломаной
        Polyline secondPolyline = new Polyline();
        secondPolyline.addPoint(new Point(start));
        secondPolyline.addPoint(new Point(2, -5));
        secondPolyline.addPoint(new Point(4, -8));
        secondPolyline.addPoint(new Point(end));
        System.out.println(secondPolyline);

        // Создание ломаной без параметров
        Polyline thirdPolyline = new Polyline();
        System.out.println(thirdPolyline);

        // Создание ломаной с указанием набора точек
        Polyline fourthPolyline = new Polyline(new Point(1, 5), new Point(2, 8), new Point(5, 3));
        System.out.println(fourthPolyline);

        // Добавление новых точек к существующей ломаной
        fourthPolyline.addPoints(new Point(5, 15), new Point(8, 10));
        System.out.println(fourthPolyline);


        // Замкнутая ломанная линия
        ClosedPolyline closedPolyline = new ClosedPolyline(
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4),
                new Point(5, 5),
                new Point(1, 1)
        );
        System.out.println(closedPolyline);
    }
}
