import java.util.ArrayList;
import java.util.HashMap;

public class Kutuphane {
    //HashMap <String,String> map=new HashMap<>();
    HashMap <String,Integer> students =new HashMap<>();
    HashMap <String,Integer> books =new HashMap<>();
    public void topluKayit(ArrayList<Pair<String, String>> kayitlar) {
        for(int i=0;i<kayitlar.size();i++){
            boolean exist=false;
            Pair pair=kayitlar.get(i);
            for(String k: students.keySet()){
                if (pair.getFirst().equals(k)){
                    exist=true;
                    Integer num=(Integer) students.get(k)+1;
                    students.put(k,num);
                }
            }

            if(!exist){
                students.put((String) pair.getFirst(),1);
            }

            exist=false;

            for(String k: books.keySet()){
                if (pair.getSecond().equals(k)){
                    exist=true;
                    Integer num=(Integer) books.get(k)+1;
                    books.put(k,num);
                }
            }

            if(!exist){
                books.put((String) pair.getSecond(),1);
            }
        }
    }

    public void ozetGec(){
        HashMap<String,Integer> temp=new HashMap<>();
        String name="";

        while (!students.isEmpty()){
            for (String student:students.keySet()){
                name=student;
                break;
            }
            for (String student:students.keySet()){
                String studentName=student;
                if(studentName.compareTo(name)<0)
                    name=student;
            }
            Integer value=students.get(name);
            System.out.println(name+" "+value);
            temp.put(name,value);
            students.remove(name,value);
        }
        students=temp;
    }

    public String enCokKitapOkuyan() {
        int max=0;
        String name="";
        for(String first:students.keySet()){
            int amount= students.get(first);
            if(amount>max){
                max=amount;
                name=first;
            }
        }
        return name;
    }

    public int toplamAlinanKitapSayisi() {
        int total=0;
        for(String first: books.keySet()){
            int amount= books.get(first);
            total+=amount;
        }
        return total;
    }

    public int toplamOkuyucuSayisi() {
        return students.size();
    }

    public String enAzOkunanKitap() {
        int min=Integer.MAX_VALUE;
        String name="";
        for(String first:books.keySet()){
            int amount= books.get(first);
            if(amount<min){
                min=amount;
                name=first;
            }
        }
        return name;
    }


}
