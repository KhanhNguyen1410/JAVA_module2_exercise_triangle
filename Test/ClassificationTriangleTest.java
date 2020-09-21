import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassificationTriangleTest {
    @Test
    @DisplayName("testing deu")
    public void testClassification(){
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String expected = "tam giac deu";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("testing can")
    public void testClassification1(){
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "tam giac can";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing thuong")
    public void testClassification2(){
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "tam giac thuong";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing khong")
    public void testClassification3(){
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "khong phai tam giac";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing khong 2")
    public void testClassification4(){
        int edge1 = -1;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "khong phai tam giac";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing khong 3")
    public void testClassification5(){
        int edge1 = 0;
        int edge2 = 1;
        int edge3 = 1;
        String expected = "khong phai tam giac";
        String result = ClassificationTriangle.classifier(edge1,edge2,edge3);
        assertEquals(expected, result);
    }


}