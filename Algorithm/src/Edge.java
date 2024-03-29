

public class Edge<V, E> {
    protected boolean directed;    // 방향 여부
    protected V here;            // 두 정점 중 첫번 째
    protected V there;            // 두 정점 중 두번 째
    protected E label;            // 라벨
    protected boolean visited;    // 방문 여부

    public Edge(V vtx1, V vtx2, E label, boolean directed) {
        this.here = vtx1;
        this.there = vtx2;
        this.label = label;
        this.directed = directed;
        visited = false;
    }

    V here() {
        return this.here;
    }

    boolean isDirected() {
        return this.directed;
    }

    boolean isVisited() {
        return this.visited;
    }

    E label() {
        return this.label;
    }

    void reset() {
        this.visited = false;
    }

    void setLabel(E label) {
        this.label = label;
    }

    V there() {
        return this.there;
    }

    boolean visit() {
        return this.visited;
    }

    /*
     * 간선을 비교한다.
     * 무방향 간선일 때 단순 비교하고,
     * 방향 간선일 때는 정점 간의 방향도 같아야 한다.
     */
    @Override
    public boolean equals(Object obj) {
        Edge<?, ?> e = (Edge<?, ?>) obj;
        return ((here().equals(e.here()) && there().equals(e.there())) ||
               ((here().equals(e.there()) && there().equals(e.here()) && !directed)));
    }

    /*
     * 라벨 및 두 정점 정보와 방향, 방문 여부 정보를 반환
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("label : " + label.toString());
        sb.append("\n");
        sb.append(here.toString());

        if(directed) sb.append(" -> ");
        else sb.append(" - ");

        sb.append(there.toString());
        sb.append("\n");
        sb.append("directed : ");
        sb.append(directed);
        sb.append(", visited : ");
        sb.append(visited);

        return sb.toString();
    }
}