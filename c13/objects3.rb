class Objects
    def method
    puts "Something in method"
    end
    private
    
    def method_private
    puts "Private!"
    
    end
    
    def method_private2
    
    end
    
    public
    
    def method_public
    
    end
end

o = Objects.new
o.send :method_private

