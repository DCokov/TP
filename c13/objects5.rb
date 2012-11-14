class Objects
    attr_accessor :var
    
    def var=(v)
        @var = v
      end
      
      def var
      @var ||= "asfasfasfas"
    end
end

o = Objects.new
p o.var
o.var = 10
p o.var
