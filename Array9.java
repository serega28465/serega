package domashya2;

public class Array9 {

	public static void main(String[] args) {
		/*
		 * Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і
		 * третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом
		 * третього масиву повинен дорівнювати відношенню елементу з першого
		 * масиву з i-им індексом до елементу з другого масиву з i-им індексом.
		 * Вивести всі три масиву на екран (кожен на окремому рядку), потім
		 * вивести кількість цілих елементів в третьому масиві.
		 */
		
		 
        int[] Arr1=new int[10];
        int[] Arr2=new int[10];
        double[]Arr3=new double[10];
      
        int cc=0;
        
        for(int i=0,b=1;b<=4;i++){
           if(b==1){
               Arr1[i]=(int)(Math.random()*8)+1;
               if(i==0)
                   System.out.print((b)+ " масив складається з наступних елементів: ");
               System.out.print(Arr1[i]+" ");
                if(i==Arr1.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
           }
           if(b==2){
               Arr2[i]=(int)(Math.random()*8)+1;
               if(i==0)
                   System.out.print((b)+ " масив складається з наступних елементів: ");
               System.out.print(Arr2[i]+" ");
               if(i==Arr2.length-1){
                   b++;
                   i=0;
                   System.out.println(" ");
               }
           }
           if(b==3){
               Arr3[i]=(double)Arr1[i]/Arr2[i];
               if(i==0)
                   System.out.print((b)+ " масив складається з наступних елементів:  ");
               System.out.print(Arr3[i]+ " ");
               if(i==Arr3.length-1){
                   b++;
                   i=0;
                   System.out.println(" ");
               }
           }
           
           if(b==4){
               if(Arr3[i]%(int)Arr3[i]==0){
                   if(cc==0){
                       System.out.print("У 3 масиві наступні цілі числа: ");
                   cc++;
                   }
                   System.out.print(Arr3[i]+", ");
               }
               if(i==Arr3.length-1){
                   if(cc==0)
                       System.out.println("У 3 масиві немає цілих чисел!");
                   break;
               }
           }
                
        }
	}

}
