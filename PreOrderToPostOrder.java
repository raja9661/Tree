public class PreOrderToPostOrder {
    // node root;
    class node
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
    static int index = 0;
    // public node buildTree(int preOrder[], int inOrder[], int start, int end, int[] index) {
    //     if (start > end) {
    //         return null;
    //     }
    
    //     int curr = preOrder[index[0]];
    //     index[0]++;
    //     node newNode = new node(curr);
    
    //     if (start == end) {
    //         return newNode;
    //     }
    
    //     int pos = search(inOrder, start, end, curr);
    //     newNode.left = buildTree(preOrder, inOrder, start, pos - 1, index);
    //     newNode.right = buildTree(preOrder, inOrder, pos + 1, end, index);
    //     return newNode;
    // }
    
    public node buildTree(int preOrder[],int inOrder[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int curr=preOrder[index++];
        node newNode=new node(curr);
        if(start==end)
        {
            return newNode;
        }
        int pos=search(inOrder,start,end,curr);
        newNode.left=buildTree(preOrder,inOrder, start, pos-1);
        newNode.right=buildTree(preOrder, inOrder, pos+1, end);
        return newNode;
    }

    public int search(int inOrder[],int start,int end,int curr)
    {
        for(int i=start;i<=end;i++)
        {
            if(inOrder[i]==curr)
            {
                return i;
            }
        }
        return -1;
    }
    public void InorderTraversal(node temp)
    {
        if(temp==null)
        {
            return;
        }
        InorderTraversal(temp.left);
        System.out.print(temp.data+" ");
        InorderTraversal(temp.right);
    }
    public static void main(String args[])
    {
        PreOrderToPostOrder p=new PreOrderToPostOrder();
        int preOrder[]={1,2,4,3,5};
        int inOrder[]={4,2,1,5,3};
        int[] index = {0};
        node root=p.buildTree(preOrder,inOrder,0,4);
        p.InorderTraversal(root);
    }
}
