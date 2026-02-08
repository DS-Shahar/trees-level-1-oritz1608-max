public static int ex14_countLeaves(BinNode<Integer> t) 
    {
        if (t == null) 
        {
            return 0;
        }
        if (!t.hasLeft() && !t.hasRight()) 
        {
            return 1;
        }
        return countLeaves(t.getLeft()) + countLeaves(t.getRight());
    }
    
    public static boolean ex18_isContained(BinNode<Integer> t1, BinNode<Integer> t2) 
    {
        if (t2 == null) 
        {
            return true;
        }
        if (t1 == null) 
        {
            return false;
        }
        if (helpex18(t1, t2)) 
        {
            return true;
        }
        return ex18_isContained(t1.getLeft(), t2) || 
        ex18_isContained(t1.getRight(), t2);
    }
    
    public static boolean helpex18(BinNode<Integer> t1, BinNode<Integer> t2) 
    {
        if (t1 == null && t2 == null) 
        {
            return true;
        }
        if (t1 == null || t2 == null) 
        {
            return false;
        }
        return t1.getValue().equals(t2.getValue()) &&
        helpex18(t1.getLeft(), t2.getLeft()) &&
        helpex18(t1.getRight(), t2.getRight());
    }
    
    public static boolean ex21_isBalanced(BinNode<Integer> t) 
    {
        if (t == null) 
        {
            return true;
        }
        int leftHeight = ex27_height(t.getLeft());
        int rightHeight = ex27_height(t.getRight());
        if (Math.abs(leftHeight - rightHeight) > 1) 
        {
            return false;
        }
        return ex21_isBalanced(t.getLeft()) && ex21_isBalanced(t.getRight());
    }

    public static int ex27_height(BinNode<Integer> t) 
    {
        if (t == null) 
        {
            return -1;
        }
        int leftHeight = ex27_height(t.getLeft());
        int rightHeight = ex27_height(t.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
