library verilog;
use verilog.vl_types.all;
entity MUL3_1 is
    port(
        I               : in     vl_logic_vector(2 downto 0);
        S               : in     vl_logic_vector(1 downto 0);
        F               : out    vl_logic
    );
end MUL3_1;
