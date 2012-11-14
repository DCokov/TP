class Objects
    @var="Blabla"
    
    def var=(v)
        @var = v    
      end
      
    def var
        @var
     
    end
end

o = Objects.new
p o.var
o.var = 10
p o.var
