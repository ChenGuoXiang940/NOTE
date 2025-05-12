library verilog;
use verilog.vl_types.all;
entity test is
    port(
        I               : in     vl_logic_vector(15 downto 0);
        number          : out    vl_logic_vector(4 downto 0)
    );
end test;
