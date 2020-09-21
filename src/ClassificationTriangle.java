public class ClassificationTriangle {
    public static String classifier(int edge1, int edge2, int edge3) {
        boolean triangle = edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge3 + edge1 > edge2;
        if (triangle){
            boolean isoscelesTriangle = edge1 == edge2 && edge1 == edge3;
            if (isoscelesTriangle){
                return "tam giac deu";
            } else {
                boolean equilateralTriangle = edge1 == edge2 || edge2 == edge3 || edge3 == edge1;
                if (equilateralTriangle){
                    return "tam giac can";
                }
                else {
                    return "tam giac thuong";
                }
            }
        } else return "khong phai tam giac";

    }
}
