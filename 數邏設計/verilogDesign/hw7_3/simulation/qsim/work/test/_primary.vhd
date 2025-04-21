library verilog;
use verilog.vl_types.all;
entity test is
    port(
        CLK             : in     vl_logic;
        RESET           : in     vl_logic;
        DIN             : in     vl_logic_vector(1 downto 0);
        Q               : out    vl_logic_vector(6 downto 0)
    );
end test;
