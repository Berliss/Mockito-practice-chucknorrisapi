package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockData {
    public static String getJokes() {

        List<String> jokes = new ArrayList<>();

        jokes.add("""
                {
                      "categories":[],
                      "created_at":"2020-01-05 13:42:21.455187",
                      "icon_url":"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
                      "id":"f4D2Q0shT7uA3OakD99QyA",
                      "updated_at":"2020-01-05 13:42:21.455187",
                      "url":"https://api.chucknorris.io/jokes/f4D2Q0shT7uA3OakD99QyA",
                      "value":"Chuck Norris's girlfriend once asked him how much wood a woodchuck could chuck if a woodchuck could chuck wood. He then shouted, \\"HOW DARE YOU RHYME IN THE PRESENCE OF CHUCK NORRIS!!!!\\" and ripped out her throat. Holding his girlfriend's bloody throat in his hand he bellowed, \\"Don't fuck with Chuck!\\" Two years and five months later he realized the irony of this statement and laughed so hard that anyone within a hundred mile radius of the blast went deaf."
                   }
                   """);

        jokes.add("""
                   {
                      "categories":[],
                      "created_at":"2020-01-05 13:42:25.905626",
                      "icon_url":"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
                      "id":"jpAgMNVtSDCLxR-tWSxxGA",
                      "updated_at":"2020-01-05 13:42:25.905626",
                      "url":"https://api.chucknorris.io/jokes/jpAgMNVtSDCLxR-tWSxxGA",
                      "value":"Chuck Norris isn't actually invincible. HE DOESN'T NEED TO BE."
                   }
                """);

        jokes.add("""
                {
                   "categories":[],
                   "created_at":"2020-01-05 13:42:27.496799",
                   "icon_url":"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
                   "id":"3au0ehUjRaCEfPAGcpkyYw",
                   "updated_at":"2020-01-05 13:42:27.496799",
                   "url":"https://api.chucknorris.io/jokes/3au0ehUjRaCEfPAGcpkyYw",
                   "value":"Chuck Norris has a .50 BMG Derringer."
                }
                """);

        return jokes.get(new Random().nextInt(2));
    }
}
