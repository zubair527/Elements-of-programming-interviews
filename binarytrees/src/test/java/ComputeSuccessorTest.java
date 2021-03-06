import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputeSuccessorTest {

  private static BinaryTreeParent<Integer> node;
  private BinaryTreeParent<Integer> expected;

  @Test
  public void findSuccessor1() throws Exception {
    expected = BinaryTreeUtil.getOddTreeWithParent();
    node = expected.left;

    test(expected, node);
  }

  @Test
  public void findSuccessor2() throws Exception {
    expected = BinaryTreeUtil.getFullTreeWithParent();
    node = expected.left.right;

    test(expected, node);
  }

  @Test
  public void findSuccessor3() throws Exception {
    expected = BinaryTreeUtil.getFigureTenDotOneWithParent();
    node = expected.left.right.right;

    test(expected, node);
  }

  @Test
  public void findSuccessor4() throws Exception {
    node = BinaryTreeUtil.getFigureFifteenDotOneWithParent();
    expected = node.right.left;

    test(expected, node);
  }

  private void test(BinaryTreeParent<Integer> expected, BinaryTreeParent<Integer> node) {
    assertEquals(expected, ComputeSuccessor.findSuccessor(node));
  }

}