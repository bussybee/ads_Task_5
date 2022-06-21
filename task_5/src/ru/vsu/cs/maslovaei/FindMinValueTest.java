package ru.vsu.cs.maslovaei;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.maslovaei.bst.BSTreeAlgorithms;

public class FindMinValueTest {

    SimpleBinaryTree<Integer> tree = new SimpleBinaryTree<>(Integer::parseInt);
    Integer factualResult;
    Integer expectedResult;

    @Test
    public void findMinValueTest1() throws Exception {
        tree.fromBracketNotation("8 (6 (4 (5), 6), 5 (, 5 (2, 8)))");
        factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));
        expectedResult = 4;
        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void findMinValueTest2() throws Exception {
        tree.fromBracketNotation("80 (62 (55 (26 (5, 39), 57)), 94)");
        factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));
        expectedResult = 5;
        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void findMinValueTest3() throws Exception {
        tree.fromBracketNotation("93 (56 (55 (21 (23, 39), 57)), 83)");
        factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));
        expectedResult = 21;
        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void findMinValueTest4() throws Exception {
        tree.fromBracketNotation("18 (6 (5), 5 (, 3 (2, 8)))");
        factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));
        expectedResult = 5;
        Assert.assertEquals(expectedResult, factualResult);
    }

    @Test
    public void findMinValueTest5() throws Exception {
        tree.fromBracketNotation("10 (7 (4 (1), 6), 5 (, 5 (2, 8)))");
        factualResult = BSTreeAlgorithms.getMinNode((tree.getRoot()));
        expectedResult = 1;
        Assert.assertEquals(expectedResult, factualResult);
    }
}
