package org.example;

import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.stream.IntStream;

public class JSONBuilder implements CharSequence, Appendable{
    private Map<String, Object> entries;
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int i) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return null;
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public IntStream codePoints() {
        return CharSequence.super.codePoints();
    }

    @Override
    public Appendable append(CharSequence charSequence) throws IOException {
        return null;
    }

    @Override
    public Appendable append(CharSequence charSequence, int i, int i1) throws IOException {
        return null;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return null;
    }

    public Appendable append(String key, Object o) throws IOException {
        this.entries.put(key, o);
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(var entry : this.entries.entrySet()){
            sb.append("\"");
            sb.append(entry.getKey());
            sb.append("\":\"");
            sb.append(entry.getValue().toString());
            sb.append("\",");
        }
        sb.delete(sb.length()-1, sb.length());
        sb.append("}");
        return sb.toString();
    }
    //    public
}
