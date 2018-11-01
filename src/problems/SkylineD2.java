package problems;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SkylineD2 {
    static class BuildingPoint implements Comparable<BuildingPoint> {

        int x;
        boolean isStart;
        int height;
        @Override
        public int compareTo( BuildingPoint o) {
            if(this.x != o.x) {
                return this.x - o.x;
            } else {
                return (this.isStart ? -this.height : this.height) - (o.isStart ? -o.height : o.height);
            }
        }
    }


}
