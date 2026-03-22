import java.util.*;
import java.util.stream.Collectors;


//Ques 1
public class Streaming {
//    static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(6);
//        list.add(15);
//        list.add(20);
//
//        list.stream()
//                .filter(n-> n%3==0 && n%5!=0 )
//                .forEach(m->System.out.println(m));
//    }

    //Ques 2
//static void main(String[] args) {
//    ArrayList<String> arr = new ArrayList<>();
//    arr.add("Cat");
//    arr.add("Dog");
//    arr.add("Run");
//    arr.add("Sun");
//
//    arr.stream()
//            .filter(n-> n.endsWith("n"))
//            .forEach(m-> System.out.println(m));
//}

//    Ques 3
//static void main(String[] args) {
//    ArrayList<Integer> salary = new ArrayList<>();
//    salary.add(10000);
//    salary.add(20000);
//    salary.add(60000);
//    salary.add(80000);
//
//    salary.stream()
//            .filter(n-> n>50000)
//            .forEach(m-> System.out.println(m));
//}

//     Ques 4
//static void main(String[] args) {
//    Stream<String> str = Stream.of("Apple","Mango","Pine","Kiwi","Orange");
//
//    str.filter(n-> n.contains("e"))
//            .forEach(m-> System.out.println(m));
//}

//    Ques 5
//static void main(String[] args) {
//    Stream<Integer> nums = Stream.of(1,2,3,4,5,6,7,8,9);
//
//    nums.filter(n-> {
//        boolean result = false;
//        for(int i=2;i<n;i++) {
//				if(n%i==0) {
//					result=false;
//					return result;
//				}
//			}
//			result=true;
//			return result;
//    })
//            .forEach(m-> System.out.println(m));
//}

//    Ques 6
//static void main(String[] args) {
//    Stream<Integer> num = Stream.of(2,5, 8, 28, 30, 45, 55, 60, 62);
//
//    num.filter(n-> n*n>500)
//            .forEach(m-> System.out.println(m));
//}

//    Ques 7
//static void main(String[] args) {
//    Stream<String> email = Stream.of("sukanya@gmail.com", "sakshi@gmail.com","soniya@gmail","sneha.gmail.com","SakshiSingh");
//    email.filter(n->n.contains("@") && n.contains("."))
//            .forEach(m-> System.out.println(m));
//}

    //Ques 1
//static void main(String[] args) {
//    List<Integer> list = Arrays.asList(1,2,3,4);
//    List<Integer> result = list.stream()
//    .map(x-> x*2)
//            .collect(Collectors.toList());
//    System.out.println(result);
//}

    //Ques 2
//    static void main(String[] args) {
//        List<String> str = Arrays.asList("sukanya rana","sakshi rajput","sneha","sakshi singh","soniya");
//        List<String> UpperStr = str.stream()
//                .map(s->s.toUpperCase())
//                .collect(Collectors.toList());
//        System.out.println(UpperStr);
//    }

// Ques 3
//static void main(String[] args) {
//        List<String> str = Arrays.asList("sukanya rana","sakshi rajput","sneha","sakshi singh","soniya");
//        List<Integer> len = str.stream()
//                        .map(l->l.length())
//                                .collect(Collectors.toUnmodifiableList());
//        System.out.println(len);
//    }

    //Ques 4
//    static void main(String[] args) {
//        List<String> str = Arrays.asList("sukanya","sakshi","sneha","sakshi","soniya");
//        List<String> len = str.stream()
//                        .map(l->{if (str == null || str.isEmpty())
//            return l;
//
//        return l.substring(0, 1).toUpperCase()
//                + l.substring(1).toLowerCase();})
//                                .collect(Collectors.toUnmodifiableList());
//        System.out.println(len);
//    }

//    static void main(String[] args) {
//        List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);
//
//        long num = list.stream().distinct().limit(5).skip(3).count();
//
//        System.out.println(num);
//    }
static void main(String[] args) {
    List<Integer> list = List.of(10,20,20,30,30,40,40,50,51,52,53);
    int n = list.size();
    List<Integer> result = list.stream().limit(n-2).toList();

    System.out.println(result);
}

}
