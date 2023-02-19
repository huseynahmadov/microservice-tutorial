package az.company.orderservice.mapper;

import az.company.orderservice.dto.OrderLineItemsDto;
import az.company.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {

    public OrderLineItems mapToEntity(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());

        return orderLineItems;
    }
}
