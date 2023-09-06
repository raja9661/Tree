public class SearchInBST {
    static node root;
    static class node
    {
        int data;
        node left;
        node right;

        node(int val)
        {
            data=val;
            left=null;
            right=null;
        }
    }
    public void find(node curr,int key)
    {
        if(curr==null)
        {
            System.out.print("Key element is not found");
            return;
        }
        if(curr.data==key)
        {
            System.out.print("Key element is found:"+curr.data);
            return;
        }
        if(key<curr.data)
        {
          find(curr.left, key);
        }
        else
        {
          find(curr.right, key);
        }
       
    }
    public node insert(node root,int val)
    {
        if(root==null)
        {
            root=new node(val);
            return root;
        }
        if(root.data==val)
        {
            System.out.print("Sorry duplicate value is not allow in BST");
            return null;
        }
        if(val<root.data)
        {
            root.left=insert(root.left, val);
        }
        else
        {
        root.right=insert(root.right, val);
        }
        return root;
    }
    // public node search1(node root,int key)
    // {
    //     if(root==null)
    //     {
    //         return null;
    //     }
    //     if(root.data==key)
    //     {
    //         return root;
    //     }
    //     if(key<root.data)
    //     {
    //         return search(root.left, key);
    //     }
    //     return search(root.right, key);
    // }
    public void InorderTraversal(node root)
    {
        if(root==null)
        {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }
    public static void main(String args[])
    {
        SearchInBST s=new SearchInBST();
        root=s.insert(root, 10);
        root=s.insert(root, 6);
        root=s.insert(root, 4);
        root=s.insert(root, 5);
        root=s.insert(root, 12);
        root=s.insert(root, 11);
        root=s.insert(root, 14);
        s.InorderTraversal(root);
        // root=new node(10);
        // root.left=new node(6);
        // root.right=new node(12);
        // s.InorderTraversal(root);
        // root=s.insert(root, 5);
        // root=s.insert(root, 14);
        // System.out.println("");
        // s.InorderTraversal(root);
       
   }
}
