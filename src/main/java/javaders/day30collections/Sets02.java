package javaders.day30collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02
{

    public static void main(String[] args)
    {

        //Example 1: Ogrenci e-mail adreslerini natural order'da siralanmis olarak depolayınız.
        //1.yol
        TreeSet<String> emails = new TreeSet<>();


        emails.add("abh@gmail.com");
        emails.add("abl@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abc@gmail.com");
        emails.add("abk@gmail.com");
        

        System.out.println(emails);

        //2.yol : Bu yol 1.yoldan daha hızlı çalışır.
        HashSet<String> emailsHs = new HashSet<>();

        emailsHs.add("abh@gmail.com");
        emailsHs.add("abl@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abk@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);
    }

}
