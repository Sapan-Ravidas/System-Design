package observer;

import cache.ResultType;

public interface Observer {
    public void notifySearch();

    public void notifySearch(ResultType resultType) ;
}
