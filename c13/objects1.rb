class Objects
    def method
    puts "Something in method"
    end
end

o = Objects.new
o.send"method"
