class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        ArrayList<Integer> closedFriends = new ArrayList<>();
        ArrayList<Integer> closedEnoughFriends = new ArrayList<>();
        findFriends(friends, id, level, closedFriends, closedEnoughFriends);
        closedEnoughFriends.remove(id);
        HashMap<String, Integer> result = new HashMap<>();
        List<String> films = new ArrayList<>();
        for (int friend : closedEnoughFriends){
            films = watchedVideos.get(friend);
            for (String film : films){
                if (!result.containsValue(film)){
                    result.put(film,0);
                }
                else{
                    result.put(film,(result.get(film)+1));
                }
            }
        }
        System.out.println(closedFriends.toString());
        System.out.println(closedEnoughFriends.toString());
        return new ArrayList<String>(result.keySet());


        
    }
    public void findFriends(int[][] friends, int id, int level, ArrayList<Integer> closedFriends, ArrayList<Integer> closedEnoughFriends){
        if (level <= 1){
            int friend = -1;
            for (int i = 0 ; i < friends[id].length ; i ++){
                friend = friends[id][i];
                if (!closedFriends.contains(friend)){
                    closedEnoughFriends.add(friend);
                    closedFriends.add(friend);
                }
                else{
                    //do nothing
                }
            }
            return;
        }
        int friend = -1;
        for (int i = 0 ; i < friends[id].length ; i++){
            friend = friends[id][i];
            closedFriends.add(friend);
            findFriends(friends, friend, (level-1), closedFriends, closedEnoughFriends);
        }
    }
    
}
