public class Pyramid {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printPyramid(5);
    }

    public void printPyramid(int numOOfSteps) {
        double midpoint = Math.floor((2 * numOOfSteps - 1) / 2);

        for (int row = 0; row < numOOfSteps; row++) {
            String level = "";
            for (int column = 0; column < 2 * numOOfSteps - 1; column++) {
                if (midpoint - row <= column && midpoint + row >= column) {
                    level += "#";
                } else {
                    level += " ";
//                    level += ""; without the space it prints on one side
                }
            }
            System.out.println(level);
        }

    }
}
