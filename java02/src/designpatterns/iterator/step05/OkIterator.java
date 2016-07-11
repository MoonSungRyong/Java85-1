package designpatterns.iterator.step05;

import java.util.ArrayList;

abstract public class OkIterator {
  ArrayList<String> list = new ArrayList<>();

  abstract public boolean hasMoreElement();
  abstract public String nextElement();
}
