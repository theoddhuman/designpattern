package com.subham.designpattern.behavioral.iterator;

import com.subham.designpattern.behavioral.iterator.library.Iterator;

/**
 * @author subham.paul
 *
 * This enum represents the aggregate from iterator pattern
 */
public enum Color {
    RED,
    ORANGE,
    BLACK,
    GREEN,
    WHITE;

    public static Iterator<Color> iterator() {
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<Color> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < Color.values().length;
        }

        @Override
        public Color next() {
            return Color.values()[position++];
        }
    }
}
