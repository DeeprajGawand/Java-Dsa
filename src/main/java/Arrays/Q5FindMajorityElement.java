package Arrays;

//IMP

//https://www.youtube.com/watch?v=1r8kzrXJiUk
//Moores voting algorithm ---it has two parts a.find the candidate element to be majority b.confrim weather it is majority
public class Q5FindMajorityElement {
    public static void main(String[] args) {

        int [] arr ={1,2,1,2,1,2,1,2,2};

        int cand  =0;
        int count =0;

        for (int i =0; i<arr.length; i++){
            if(count==0){
                cand = arr[i];
            }
            if (cand==arr[i]){
                count++;
            }else {
                count--;
            }
        }
        System.out.println(cand);

    }
}
