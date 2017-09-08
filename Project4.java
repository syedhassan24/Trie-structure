

import java.util.*; 
import java.util.Scanner;

 class Node {
     boolean terminal;
     int outDegree=0;
     Node children[]=new Node[26];
     Node(boolean x , int y)
     {
         terminal=x;
         outDegree+=y;
     }
}

class Trie
    {
        //String word
        boolean check;
        Node x;
        Node root;
        int length;
        String num[];
        int count=0;
        Trie()
        {
         root=new Node (false,1);
         x=root;
        }
        private void Number(String s)
        {
            String x="";
            length=s.length();
                for(int count1=0;count1<length;count1++)
{
              if(s.charAt(count1)=='a')
             {    
                  x+="0,"; 
             }
              if(s.charAt(count1)=='b')
              {
                   x+="1,";
              }
              if(s.charAt(count1)=='c')
              {
                   x+="2,";
              }
               if(s.charAt(count1)=='d')
              {
                   x+="3,";
              }
                if(s.charAt(count1)=='e')
              {
                   x+="4,";
              }
                 if(s.charAt(count1)=='f')
              {
                   x+="5,";
              }
                  if(s.charAt(count1)=='g')
              {
                   x+="6,";
              }
                   if(s.charAt(count1)=='h')
              {
                   x+="7,";
              }
                    if(s.charAt(count1)=='i')
              {
                   x+="8,";
              }
                     if(s.charAt(count1)=='j')
              {
                   x+="9,";
              }
                      if(s.charAt(count1)=='k')
              {
                   x+="10,";
              }
                       if(s.charAt(count1)=='l')
              {
                   x+="11,";
              }
                        if(s.charAt(count1)=='m')
              {
                   x+="12,";
              }
                         if(s.charAt(count1)=='n')
              {
                   x+="13,";
              }
                          if(s.charAt(count1)=='o')
              {
                   x+="14,";
              }
                           if(s.charAt(count1)=='p')
              {
                   x+="15,";
              }
                            if(s.charAt(count1)=='q')
              {
                   x+="16,";
              }
                             if(s.charAt(count1)=='r')
              {
                   x+="17,";
              }
                              if(s.charAt(count1)=='s')
              {
                   x+="18,";
              }
                               if(s.charAt(count1)=='t')
              {
                   x+="19,";
              }
                                if(s.charAt(count1)=='u')
              {
                   x+="20,";
              }
                                 if(s.charAt(count1)=='v')
              {
                   x+="21,";
              }
                                  if(s.charAt(count1)=='w')
              {
                   x+="22,";
              }
                                   if(s.charAt(count1)=='x')
              {
                   x+="23,";
              }
                                    if(s.charAt(count1)=='y')
              {
                   x+="24,";
              }
                                     if(s.charAt(count1)=='z')
              {
                   x+="25,";
              }
              num= x.split(",");
}
        }
      public boolean insert(String s)
      {
          check=true;
          Number(s);
         if (search(num[count])==true)
      {   for(;count<length;count++)
          {
           if(count==length-1)
                  {
                      x.children[count]=new Node (true,0);
                  }
           else
           {
               x.children[Integer.parseInt(num[count])]=new Node(false,1);
           }
           x=x.children[Integer.parseInt(num[count])];
          }
          }
          
         x=root;
          count=0;
     return check;
     
    }
          private boolean search(String s)
      {
           if(count==length-1)
                  {
                      if(x.children[count].terminal==true){
                      check =false;
                      return check;
                      }
                      else{
                          check=true;
                          return check;
                      }
                     
                  }  
          if(x.children[Integer.parseInt(s)]!=null)
          {
            x=x.children[Integer.parseInt(s)];
            count++;
            
            search(num[count]);
         }
          
          return check;
      }
          public boolean present(String s)
          {
             Number(s);
           count=0;
             if(!search(num[count]))
             {
                 check=true;
             }
             else
             {
                 check=false;
             }
             x=root;
             count=0;
             return check;
                 
          }
      private boolean presentp (String s)
      {
            if(count==length-1)
             {
                 if(x.children[count].terminal==true){
                 check =true;
                 return check;
                 }
              }
       
          if(x.children[Integer.parseInt(s)]!=null)
          {
            x=x.children[Integer.parseInt(s)];
            count++;       
            present(num[count]);
          }
       return check;  
      }
      
            public int Membership()
            {
                return 4;
            }
            public void Listall()
            {
                x=root;
            }

            private int memberprivate(Node x)
                    {
                         x=root;
           
                 return 3;
                    }
            public boolean Delete(String s)
            {
                return true;
            }
    }
 class Project4 {
   
      
      
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Trie k=new Trie();
        boolean notDone = true;
         while(notDone) { 
            String line = in.nextLine();
            String [] tokens = line.split(" ");
            switch(tokens[0]) {
                case"A":
                    if(k.insert(tokens[1])==true)
                    {
                        System.out.println(" you did it");
                    }
                    else
                    {
                        System.out.println("you wrong");
                    }
                    break;
                    case"b":
                        if(k.present(tokens[1])==true)
                        {
                            System.out.println("there is a word");
                        }
                        else
                        {
                            System.out.println(" word ");
                        }
                        break;
            }
            }
         }
