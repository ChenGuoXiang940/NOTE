library verilog;
use verilog.vl_types.all;
entity DECODER3_8_vlg_check_tst is
    port(
        Y               : in     vl_logic_vector(7 downto 0);
        sampler_rx      : in     vl_logic
    );
end DECODER3_8_vlg_check_tst;
