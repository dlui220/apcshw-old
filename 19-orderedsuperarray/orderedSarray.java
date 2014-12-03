public class orderedSarray extends sarray {
    public boolean add(String word) {
	if (size() == 0) {
	    super.add(word);
	} else if (word.compareTo(get(size() - 1)) > 0) {
	    add(size(),word);
	} else {
	    for (int i = 0; i < size(); i++) {
		if (word.compareTo(get(i)) < 0) {
		    add (i,word);
		    break;
		}
	    }
	}
	return true;
    }

}
