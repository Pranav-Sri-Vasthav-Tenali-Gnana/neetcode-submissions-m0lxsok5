class FreqStack {

    HashMap<Integer, Integer> keyToFreq;
    HashMap<Integer, Stack<Integer>> freqToKey;
    int mostFreq;

    public FreqStack() {
        keyToFreq = new HashMap<>();
        freqToKey = new HashMap<>();
        mostFreq = 0;
    }
    
    public void push(int val) {
        keyToFreq.put(val, keyToFreq.getOrDefault(val, 0) + 1);
        int freq = keyToFreq.get(val);

        freqToKey.putIfAbsent(freq, new Stack<>());
        freqToKey.get(freq).push(val);

        mostFreq = Math.max(mostFreq, freq);
    }
    
    public int pop() {
        Stack<Integer> st = freqToKey.get(mostFreq);
        int removed = st.pop();

        if (st.isEmpty()) {
            freqToKey.remove(mostFreq);
            mostFreq--;
        }

        keyToFreq.put(removed, keyToFreq.get(removed) - 1);
        if (keyToFreq.get(removed) == 0) {
            keyToFreq.remove(removed);
        }

        return removed;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */