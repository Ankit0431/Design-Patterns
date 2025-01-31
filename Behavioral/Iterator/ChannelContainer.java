public class ChannelContainer implements Container{
    private String[] channels;
    ChannelContainer(String[] channels){
        this.channels = channels;
    }
    public Iterator getIterator(){
        return new ChannelIterator();
    }

    private class ChannelIterator implements Iterator{
        private int index = 0;
        public boolean hasNext(){
            return index < channels.length;
        }
        public String next(){
            if(!hasNext())
                return null;
            String returnable = channels[index];
            index += 1;
            return returnable;
        }
    }
}

